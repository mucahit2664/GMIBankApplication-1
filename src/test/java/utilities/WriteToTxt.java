package utilities;

import pojos.Country;
import pojos.Customer;
import pojos.State;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToTxt {
    public static void saveDataInFile(String fileName, Customer[] customers){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
            for (int i = 0;  i< customers.length; i++ )
                writer.append(customers[i].getSsn()+ ",\n");

            writer.close();
        }catch (Exception e){

        }

}
        public static void saveAllCountry(String fileName, Country[] country){
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));


        for (int i = 0; i<country.length; i++)
        writer.append(country[i].getName()+"\n");
        writer.close();
        }catch (Exception e){

        }
        }
public static void saveAllStates(String fileName, State[] states){
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

        for (int i = 0; i<states.length; i++)
        writer.append(states[i].getName()+" , "+states[i].getId()+"\n");
        writer.close();
        }catch (Exception e){

        }
        }
        public static void writeAllStatesInFile(String fileName, State[] states) throws Exception {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (State data : states
            ) {
                bufferedWriter.append(data.getId() + "@" + data.getName());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();//memory bosaltiyor
            bufferedWriter.close();//isimiz bitince kapatmamiz gerek
        }
}
