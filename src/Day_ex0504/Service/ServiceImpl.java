package Day_ex0504.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Day_ex0504.vo.PatientVO;

public class ServiceImpl implements Service {
    List<PatientVO> patientList = new ArrayList<>();
    private ObjectOutputStream oos = null;
    private ObjectInputStream ois = null;
    private final String PATH = ".\\data\\PatientsData.dat";

    public ServiceImpl() {
        getFile();
    }

    @Override
    public boolean regist(PatientVO patient) {
        patientList.add(patient);
        return true;
    }

    @Override
    public List<PatientVO> findByPatientName(String name) {
        List<PatientVO> tempList = new ArrayList<>();
        for(int i=0 ; i<patientList.size() ; i++){
            if(patientList.get(i).getName().equals(name))
                tempList.add(patientList.get(i));
        }
        return tempList;
    }

    @Override
    public PatientVO findByPatientId(String patientCode) {
        for(int i=0 ; i<patientList.size() ; i++){
            if(patientList.get(i).getPatientId().equals(patientCode))
                return patientList.get(i);
        }
        return null;
    }

    @Override
    public void getFile() {
        try {
            ois = new ObjectInputStream(new FileInputStream(PATH));
            this.patientList = (List<PatientVO>)ois.readObject();
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

    @Override
    public void setFile() {
        try {
            oos = new ObjectOutputStream(new FileOutputStream(PATH));

            oos.writeObject(patientList);
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
    }

    @Override
    public List<PatientVO> selectAll() {
        return patientList;
    }
}
