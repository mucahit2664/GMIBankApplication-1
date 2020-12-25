package utilities;

import org.junit.Assert;
import pojos.Country;
import pojos.Customer;
import pojos.State;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public static List<String> returnAllCountry(String filePath){
        List<String> allcountries = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
          //  System.out.println(line);

            int i = 0;

            while(line != null){
                String temp = "";
                temp = line.split(",")[0].trim();

                sb.append(System.lineSeparator());
                line = br.readLine();

                  System.out.println(i++);

                allcountries.add(temp);
            }
            String everything = sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return allcountries;
    }
    public static List<Country> returnAllCountryName(String filePath){
        List<Country> AllCountryInfo= new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
         //  System.out.println(line);

            int i = 0;
            while(line != null){
                Country countries = new Country();
                String temp="";
                temp = line.split(",")[0].trim();

                sb.append(System.lineSeparator());
                line = br.readLine();

               // System.out.println(i++);
                countries.setName(temp);
               // System.out.println(temp);
                AllCountryInfo.add(countries);
            }
            String everything = sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return AllCountryInfo;
    }
    public static void readAndValidateStates(String fileName, State[] states) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        List<String> expectedData = bufferedReader.lines().collect(Collectors.toList());
        for (int i = 0; i <states.length ; i++) {

            Assert.assertEquals(expectedData.get(i).split("@")[0],states[i].getId().toString());

        }
    }
}
