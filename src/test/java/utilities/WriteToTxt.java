package utilities;

import pojos.Country;
import pojos.Customer;
import pojos.State;

import java.io.BufferedWriter;
import java.io.FileWriter;

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

    public static void saveDataInFileWithAllData(String fileName, Customer[] customers){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            for (int i = 0; i< customers.length; i++){
                writer.append(customers[i].getFirstName()+" , "+customers[i].getLastName()+"\n");

                if(customers[i].getUser() != null)
                    writer.append(customers[i].getUser().getFirstName());
                if (customers[i].getCountry() != null)
                    writer.append(customers[i].getCountry().getName());

            }

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

}
