/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmbank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author CSHS-PC105
 */
public class CSVManager {
    
  private static final String FILE = "accounts.csv";


    // SAVE ACCOUNT
    public static void saveAccount(String name, String pin, double balance) {

        try (FileWriter fw = new FileWriter(FILE, true)) {

            fw.write(name + "," + pin + "," + balance + "\n");

        } catch (IOException e) {

            System.out.println("Error saving account");

        }
    }



    // LOGIN
    public static boolean login(String name, String pin) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {

            String line;

            while((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if(data[0].equals(name) && data[1].equals(pin)) {
                    return true;
                }
            }

        } catch(IOException e) {

            System.out.println("File not found");

        }

        return false;
    }




    // GET BALANCE
    public static double getBalance(String name) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {

            String line;

            while((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if(data[0].equals(name)) {

                    return Double.parseDouble(data[2]);

                }
            }

        } catch(Exception e) {

            System.out.println(e);

        }

        return 0;
    }




    // GET PIN
    public static String getPin(String name) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {

            String line;

            while((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if(data[0].equals(name)) {

                    return data[1];

                }
            }

        } catch(Exception e) {

            System.out.println(e);

        }

        return "";
    }




    // UPDATE BALANCE
    public static void updateBalance(String name, double newBalance) {

        ArrayList<String> accounts = new ArrayList<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(FILE));

            String line;

            while((line = br.readLine()) != null) {

                String[] data = line.split(",");


                if(data[0].equals(name)) {

                    line = data[0] + ","
                            + data[1] + ","
                            + newBalance;

                }

                accounts.add(line);

            }

            br.close();


            FileWriter fw = new FileWriter(FILE);


            for(String acc : accounts) {

                fw.write(acc + "\n");

            }

            fw.close();


        } catch(Exception e) {

            System.out.println(e);

        }

    }





    // UPDATE PIN
    public static void updatePin(String name, String newPin) {

        ArrayList<String> accounts = new ArrayList<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(FILE));

            String line;


            while((line = br.readLine()) != null) {

                String[] data = line.split(",");


                if(data[0].equals(name)) {


                    line = data[0] + ","
                            + newPin + ","
                            + data[2];

                }


                accounts.add(line);

            }


            br.close();


            FileWriter fw = new FileWriter(FILE);


            for(String acc : accounts) {

                fw.write(acc + "\n");

            }


            fw.close();


        } catch(Exception e) {

            System.out.println(e);

        }

    }





    // RESET NAME AND PIN
    // BALANCE HINDI BABAGUHIN
    public static void resetAccount(
            String oldName,
            String newName,
            String newPin) {


        ArrayList<String> accounts = new ArrayList<>();


        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(FILE)
                    );


            String line;


            while((line = br.readLine()) != null) {


                String[] data = line.split(",");


                if(data[0].equals(oldName)) {


                    // same balance
                    line = newName + ","
                            + newPin + ","
                            + data[2];

                }


                accounts.add(line);

            }


            br.close();



            FileWriter fw =
                    new FileWriter(FILE);



            for(String acc : accounts) {

                fw.write(acc + "\n");

            }


            fw.close();


        } catch(Exception e) {

            System.out.println(e);

        }

    }
    
    
}
