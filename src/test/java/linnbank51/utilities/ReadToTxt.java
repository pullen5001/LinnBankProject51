package linnbank51.utilities;

import com.github.javafaker.Number;
import linnbank51.pojos.Country;
import linnbank51.pojos.Customer;
import linnbank51.pojos.Registrants;
import linnbank51.pojos.States;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadToTxt {
    public static List<Customer> returnCustomer(String filePath) {
        List<Customer> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ConfigurationReader.getProperty(filePath)))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                Customer customer = new Customer();
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                String[] each = line.split(",");
                customer.setFirstName(each[0]);
                customer.setLastName(each[1]);
                customer.setSsn(each[2]);
                all.add(customer);
            }
            String everything = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }
    public static List<Registrants> returnCustomer2(String filePath) {
        List<Registrants> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            int i = 0;
            while (line != null) {
                Registrants registrants = new Registrants();
                registrants.setFirstName(line.split("`")[0]);
                registrants.setLastName(line.split("`")[1]);
                registrants.setAddress(line.split("`")[2]);
                registrants.setMobilePhoneNumber(line.split("`")[3]);
                registrants.setUserName(line.split("`")[5]);
                registrants.setEmail(line.split("`")[6]);
                registrants.setSsn(line.split("`")[4]);
                registrants.setId(Integer.parseInt(line.split("`")[7]));



                    registrants.setUserId(Integer.parseInt(line.split("`")[8]));





                sb.append(System.lineSeparator());
                line = br.readLine();
                i++;
                all.add(registrants);

            }
            String everything = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    public static List<Customer> returnCustomerSNN(String filePath) {
        List<Customer> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Customer customer = new Customer();
                customer.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    public static List<Customer> readTxtData(String filePath) throws Exception {
        List<Customer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            Customer customer = new Customer();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
//                customer.setSsn(line);
            }
            String everything = sb.toString();
            customer.setSsn(everything);
            list.add(customer);
        } finally {
            br.close();
        }
        return list;
    }

    public static List<States> returnAllStates(String filePath) {
        List<States> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                States state = new States();
                String[] allLine = line.split(",");
                int id = Integer.parseInt(allLine[1].trim());
                state.setId(id);
                state.setName(allLine[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(state);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnCustomerSNNList(String filePath) {
        List<String> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Customer customer = new Customer();
                customer.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(customer.getSsn());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }
    public static List<String> returnRegistrantsSNNList2(String filePath) {
        List<String> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Registrants registrants = new Registrants();
                registrants.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(registrants.getSsn());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    public static List<States> returnAllStates2(String filePath) {
        List<States> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                States states = new States();
                states.setName(line.split(",")[0].trim());
                states.setId(Integer.parseInt(line.split(",")[1].trim()));
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(states);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnAllStates3(String filePath) {
        List<String> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                String temp = "";
                temp = line.split(",")[0].trim();
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }


    public static List<String> returnCountryIdList(String filePath) {
        List<String> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Customer customer = new Customer();
                customer.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(customer.getSsn());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnCountryNameList(String filePath) {
        List<String> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Country country5 = new Country();
                country5.setName(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(country5.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnCountry5IdList(String filePath) {
        List<String> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Country country5 = new Country();
                country5.setId(Integer.parseInt(line.split(",")[0]));
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(String.valueOf(country5.getId()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

}