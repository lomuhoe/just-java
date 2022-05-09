package Day_0405.moe.chei.board.vo;

import java.util.Date;

public class Board {
    private int seqno;
    private String title;
    private String writer;
    private String content;
    private Date regdate;
    private int hitcount;
    private String attchFile;

    public void Board() {}
    public void Board(int seqno, String title, String writer, String content, Date regdate, int hitcount, String attchFile) {
        this.seqno = seqno;
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.regdate = regdate;
        this.hitcount = hitcount;
        this.attchFile = attchFile;
    }

    //setter
    public void setSeqno(int seqno) {this.seqno = seqno;}
    public void setTitle(String title) {this.title = title;}
    public void setWriter(String writer) {this.writer = writer;}
    public void setContent(String content) {this.content = content;}
    public void setRegdate(Date regdate) {this.regdate = regdate;}
    public void setHitcount(int hitcount) {this.hitcount = hitcount;}
    public void setAttchFile(String attchFile) {this.attchFile = attchFile;}

    //getter
    public int getSeqno() {return seqno;}
    public String getTitle() {return title;}
    public String getWriter() {return writer;}
    public String getContent() {return content;}
    public Date getRegdate() {return regdate;}
    public int getHitcount() {return hitcount;}
    public String getAttchFile() {return attchFile;}
}
