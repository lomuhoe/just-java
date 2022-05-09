package moe.chei.book.ui;

import java.util.List;
import java.util.Scanner;

import moe.chei.book.service.BookService;
import moe.chei.book.service.BookServiceimpl;
import moe.chei.book.vo.Book;
import moe.chei.book.vo.Magazine;
import moe.chei.book.vo.Novel;

public class BookUI {
    Scanner scan = new Scanner(System.in);
    BookService bookService = new BookServiceimpl();
    
    private void inputNovel(){
        Novel novel = (Novel)setBook(new Novel());
        if(novel==null){
            return;
        }

        System.out.print("저자 > ");
        String author = scan.nextLine();
        novel.setAuthor(author);

        System.out.print("장르 > ");
        String genre = scan.nextLine();
        novel.setGenre(genre);

        bookService.insert(novel);
    }

    private void inputMagazine(){
        Magazine magazine = (Magazine)setBook(new Magazine());
        if(magazine==null){
            return;
        }

        System.out.print("연도 > ");
        int year = scan.nextInt();
        magazine.setYear(year);

        System.out.print("월 > ");
        int month = scan.nextInt();
        magazine.setMonth(month);
        scan.nextLine();

        System.out.print("유형 > ");
        String type = scan.nextLine();
        magazine.setType(type);

        bookService.insert(magazine);
    }

    private Book setBook(Book book){
        System.out.print("ID > ");
        String id = scan.nextLine();

        Book temp = bookService.selectOne(id);
        if(temp!=null){
            System.out.println("이미 있는 아이디입니다!");
            return null;
        }

        System.out.print("퍼블리셔 > ");
        String publisher = scan.nextLine();

        System.out.print("타이틀 > ");
        String title = scan.nextLine();

        book.setId(id);
        book.setPublisher(publisher);
        book.setTitle(title);

        return book;
    }

    private void selectAll(){
        List<Book> bookList = bookService.selectAll();
        for(Book book : bookList){
            book.toString();
        }
    }

    private void delete(){
        Book tempbook;
        String tempstr;
        int tempInt;
        System.out.print("삭제할 책의 id를 입력해주세요 > ");
        tempstr = scan.nextLine();
        tempbook = bookService.selectOne(tempstr);
        if(tempbook == null){
            System.out.println("해당 책을 찾지 못했습니다.");
            return;
        } else {
            System.out.print(tempbook.toString() + " 해당 책을 정말로 삭제하시겠습니까? (y/n) : ");
            tempstr = scan.nextLine();
            if(tempstr.equalsIgnoreCase("y")){
                tempInt = bookService.delete(tempbook);
                if(tempInt!=-1){
                    System.out.println("해당 책을 삭제하였습니다.");
                } else {
                    System.out.println("책의 삭제에 실패하였습니다. 다시 시도해주세요.");
                }
            } else {
                System.out.println("삭제를 취소하셨습니다.");
            }
        }
    }

    private void update(){
        System.out.print("수정할 책의 id를 입력해주세요 > ");
        String tempstr = scan.nextLine();
        Book tempbook = bookService.selectOne(tempstr);
        if(tempbook == null){
            System.out.println("해당 책을 찾지 못했습니다.");
            return;
        } else {
            int control=-1;
            if(tempbook instanceof Novel){
                while (control!=0) {
                    System.out.println("수정할 부분을 선택해주세요."); 
                    System.out.println("1. 이름      2. 퍼블리셔     3.저자      4. 장르     0. 수정 적용");
                    control = scan.nextInt();
                    scan.nextLine();
                    switch(control){
                    case 1:
                        System.out.print("수정할 이름 > ");
                        tempbook.setTitle(scan.nextLine()); 
                        break;   
                    case 2:
                        System.out.print("수정할 퍼블리셔 > ");
                        tempbook.setPublisher(scan.nextLine());
                        break;
                    case 3:
                        System.out.print("수정할 저자 > ");
                        ((Novel)tempbook).setAuthor(scan.nextLine());
                        break;
                    case 4:
                        System.out.print("수정할 장르 > ");
                        ((Novel)tempbook).setGenre(scan.nextLine());
                        break;
                    case 0:
                        System.out.println("수정을 적용합니다.");
                        break;
                    default :
                        System.out.println("정확히 입력해주세요. ");
                    }
                    int i = bookService.update(tempbook);
                    if(i==1){
                        System.out.println("정상적으로 업데이트 되었습니다.");
                    } else {
                        System.out.println("업데이트에 실패하였습니다.");
                    }
                }
            }else if(tempbook instanceof Magazine){
                while (control!=0) {
                    System.out.println("수정할 부분을 선택해주세요."); 
                    System.out.println("1. 이름      2. 퍼블리셔     3.년      4. 월        5.타입          0. 수정 적용");
                    control = scan.nextInt();
                    scan.nextLine();
                    switch(control){
                    case 1:
                        System.out.print("수정할 이름 > ");
                        tempbook.setTitle(scan.nextLine()); 
                        break;   
                    case 2:
                        System.out.print("수정할 퍼블리셔 > ");
                        tempbook.setPublisher(scan.nextLine());
                        break;
                    case 3:
                        System.out.print("수정할 년 > ");
                        ((Magazine)tempbook).setYear(scan.nextInt());
                        scan.nextLine();
                        break;
                    case 4:
                        System.out.print("수정할 월 > ");
                        ((Magazine)tempbook).setMonth(scan.nextInt());
                        scan.nextLine();
                        break;
                    case 5:
                        System.out.print("수정할 타입 > ");
                        ((Magazine)tempbook).setType(scan.nextLine());
                        break;
                    case 0:
                        System.out.println("수정을 적용합니다.");
                        break;
                    default :
                        System.out.println("정확히 입력해주세요. ");
                    }
                    int i = bookService.update(tempbook);
                    if(i==1){
                        System.out.println("정상적으로 업데이트 되었습니다.");
                    } else {
                        System.out.println("업데이트에 실패하였습니다.");
                    }
                }
            }
        }
    }

    private void selectOne(){
        System.out.print("검색할 책의 id를 입력해주세요 > ");
        String tempstr = scan.nextLine();
        Book tempbook = bookService.selectOne(tempstr);
        if(tempbook==null){
            System.out.println("해당 id의 책이 검색되지 않았습니다.");
        }else {
            System.out.println(tempbook);
        }
    }
}
