package utilities;

import pojos.Customer;
import pojos.State;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {

    public static List<Customer> returnCustomerSSN(String filePath){
        List<Customer> all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);

            int i = 0;

            while(line != null){
                Customer customer = new Customer();
                customer.setSsn(line.split(",")[0]);

                sb.append(System.lineSeparator());
                line = br.readLine();

                //   System.out.println(i++);

                all.add(customer);
            }
            String everything = sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

    public static List<State> returnAllStates(String filePath){
        List<State> all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);

            int i = 0;

            while(line != null){
                State states = new State();
                states.setName(line.split(",")[0]);
                states.setId(Integer.parseInt(line.split(",")[1]));

                sb.append(System.lineSeparator());
                line = br.readLine();

                //   System.out.println(i++);

                all.add(states);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
}
