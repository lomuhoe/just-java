package fitness4.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import fitness4.FitnessVO;

public class FitnessServiceImpl implements FitnessService {
    private List<FitnessVO> list = new ArrayList<>();
    private ObjectOutputStream oos = null;
    private ObjectInputStream ois = null;
    private final String PATH = ".\\data\\FitnessMember.dat";
    

    public FitnessServiceImpl() {
            getFile();
    }

    private void getFile() {
        try {
            ois = new ObjectInputStream(new FileInputStream(PATH));

            this.list = (List<FitnessVO>)ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int setFile() {
            try {
                oos = new ObjectOutputStream(new FileOutputStream(PATH));

                oos.writeObject(list);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(oos!=null)
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        return -1;
    }

    @Override
    public int regist(FitnessVO vo) {
        list.add(vo);
        return 1;
    }

    @Override
    public FitnessVO selectById(String usrid) {
        int i = searchPositionOfFitness(usrid);
        if(i!=-1)
            return list.get(i);
        return null;
    }

    @Override
    public List<FitnessVO> selectAll() {
        return list;
    }

    @Override
    public int delete(String usrid) {
        int i = searchPositionOfFitness(usrid);
        if(i!=-1){
            list.remove(i);
            return 1;
        }
        return -1;
    }

    @Override
    public int update(FitnessVO vo) {
        int i = searchPositionOfFitness(vo.getUsrid());
        if(i==-1)
            return -1;
        list.set(i, vo);
        return 1;
    }

    private int searchPositionOfFitness(String usrid){
        for(int i=0 ; i<list.size() ; i++){
            if(list.get(i).equals(usrid))
                return i;
        }
        return -1;
    }
}
