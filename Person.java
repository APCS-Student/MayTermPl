import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Person {


    private String firstName;
    private String lastName;
    private int grade;
    private int postDate;


    private int cOne;
    private int cTwo;
	  private int cThree;
    private int cFour;
		private int cFive;
		private int cSix;
		private int cSeven;
		private int cEight;
		private int cNine;
		private int cTen;
		private int cEleven;
		private int cTwelve;
		private int cThirdteen;
		private int cFourteen;
		private int cFiveteen;
		private int cSixteen;

    private ArrayList<Person> peopleList = new ArrayList<Person>();
    
		private ArrayList<Person> mayTermListOne = new ArrayList<Person>();
    private ArrayList<Person> mayTermListTwo = new ArrayList<Person>();	
    private ArrayList<Person> mayTermListThree = new ArrayList<Person>();
    private ArrayList<Person> mayTermListFour = new ArrayList<Person>();	
    private ArrayList<Person> mayTermListFive = new ArrayList<Person>();
    private ArrayList<Person> mayTermListSix = new ArrayList<Person>();
    private ArrayList<Person> mayTermListSeven = new ArrayList<Person>();
    private ArrayList<Person> mayTermListEight = new ArrayList<Person>();
    private ArrayList<Person> mayTermListNine = new ArrayList<Person>();
    private ArrayList<Person> mayTermListTen = new ArrayList<Person>();
    private ArrayList<Person> mayTermListEleven = new ArrayList<Person>();
    private ArrayList<Person> mayTermListTwelve = new ArrayList<Person>();
    private ArrayList<Person> mayTermListThirdTeen = new ArrayList<Person>();
    private ArrayList<Person> mayTermListFourTeen = new ArrayList<Person>();
    private ArrayList<Person> mayTermListFiveTeen = new ArrayList<Person>();
    private ArrayList<Person> mayTermListSixTeen = new ArrayList<Person>();

		Scanner scan = new Scanner(System.in);



    public Person(){
        firstName = "none";
        lastName = "none";
        postDate = 0;
    }

    public Person(String fName, String lName, int pDate, int mGrade, int fc, int bc, int ms, int ga, int rg, int ye, int sr, int cc, int lh, int im, int bs, int ca,int tw, int hc,int mr, int gd){
        firstName = fName;
        lastName = lName;
        postDate = pDate;
        grade = mGrade;

			
				 cOne = fc;
    		 cTwo = bc;
	 		   cThree = ms;
   		   cFour = ga;
				 cFive = rg;
				 cSix = ye;
				 cSeven = sr;
				 cEight = cc;
				 cNine = lh;
				 cTen = im;
				 cEleven = bs;
				 cTwelve = ca;
				 cThirdteen = tw;
				 cFourteen = hc;
				 cFiveteen = mr;
				 cSixteen = gd;
    }

    public String getFirstName(){
        return firstName;
    }

		public String getLastName(){
			return lastName;
		}

    public ArrayList<Person> getArrayList(){
        readFile();
        return peopleList;
    }

		public int getPostDate(){
			return postDate;
		}

		public int getGrade(){

			return grade;
		}

		public int getCone(){
			return cOne;
		}
		
		public int getCtwo(){
			return cTwo;
		}
		
		public int getCthree(){
			return cThree;
		}

		public int getFour(){
			return cFour;
		}

		public int getFive(){
			return cFive;
		}

		public int getSix(){
			return cSix;
		}

		public int getSeven(){
			return cSeven;
		}

		public int getEight(){
			return cEight;
		}

		public int getNine(){
			return cNine;
		}

		public int getTen(){
			return cTen;
		}

		public int getEleven(){
			return cEleven;
		}

		public int getTwelve(){
			return cTwelve;
		}

		public int getThirdteen(){
			return cThirdteen;
		}

		public int getFourteen(){
			return cFourteen;
		}

		public int getFiveteen(){
			return cFiveteen;
		}

		public int getSixteen(){
			return cSixteen;
		}

    public void readFile(){
        try {
            //reads the csv file
            File file = new File("Mayterm2020.csv");
            FileReader fileReader = new FileReader(file);

            BufferedReader reader = new BufferedReader(fileReader);

            String line;

            //runs through each element of the file and whenever there is a comma it makes a new element in an aray called fields
            while ((line = reader.readLine()) != null) {

                String[] fields = line.split(",");
                //creates new objects for the 3 main data fields: first name, last name, company
													try {
                peopleList.add(new Person(fields[2], fields[1], Integer.parseInt(fields[0]), Integer.parseInt(fields[3]), Integer.parseInt(fields[4]), Integer.parseInt(fields[5]), Integer.parseInt(fields[6]), Integer.parseInt(fields[7]), Integer.parseInt(fields[8]), Integer.parseInt(fields[9]), Integer.parseInt(fields[10]), Integer.parseInt(fields[11]), Integer.parseInt(fields[12]), Integer.parseInt(fields[13]), Integer.parseInt(fields[14]), Integer.parseInt(fields[15]), Integer.parseInt(fields[16]), Integer.parseInt(fields[17]), Integer.parseInt(fields[18]), Integer.parseInt(fields[19])));
							}catch (NumberFormatException nfe){
						nfe.printStackTrace();
						}
					}
					 reader.close();
            //closes and stops reading file

				} catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void printList(){
			  readFile();

				System.out.print("\033[H\033[2J");
				sortTerms();
				System.out.print("\033[H\033[2J");
      
			 System.out.println("People In first May Term: ");
				for(int i = 0; i < mayTermListOne.size(); i++){
						System.out.println(mayTermListOne.get(i).getLastName());
        }
				System.out.println("");
				System.out.println("People In Second May Term: ");
				for(int i = 0; i < mayTermListTwo.size(); i++){
						System.out.println(mayTermListTwo.get(i).getLastName());
        }
				System.out.println("");
				System.out.println("People In third May Term: ");
				for(int i = 0; i < mayTermListThree.size(); i++){
						System.out.println(mayTermListThree.get(i).getLastName());
        }
				System.out.println("");
				System.out.println("People In fourth May Term: ");
				for(int i = 0; i < mayTermListFour.size(); i++){
						System.out.println(mayTermListFour.get(i).getLastName());
        }
				System.out.println("");
				
				System.out.println("People In fifth May Term: ");
				for(int i = 0; i < mayTermListFive.size(); i++){
						System.out.println(mayTermListFive.get(i).getLastName());
        }
				

				System.out.println("");
				System.out.println("People left: ");
				for(int i = 0; i < peopleList.size(); i++){
						System.out.println(peopleList.get(i).getLastName());
        }		

				System.out.println("");
				System.out.println(mayTermListOne.size() + mayTermListTwo.size() + mayTermListThree.size() + mayTermListFour.size() + mayTermListFive.size() + mayTermListSix.size() + mayTermListSeven.size() + mayTermListEight.size() + mayTermListNine.size() + mayTermListTen.size() + mayTermListEleven.size() + mayTermListTwelve.size() + mayTermListThirdTeen.size() + mayTermListFourTeen.size() + mayTermListFiveTeen.size() + mayTermListSixTeen.size());		
		
		}

		public void sortTerms(){
			//System.out.print("\033[H\033[2J");
			
			
				for(int i = 0; i < peopleList.size(); i++){
					for(int k = 1; k < 16; k++){
					if (peopleList.get(i).getCone()==k && mayTermListOne.size() < 14) {
 						mayTermListOne.add(peopleList.get(i));
						peopleList.remove(i);
					} else if (peopleList.get(i).getCtwo()==k && mayTermListTwo.size() < 14) {
 					  mayTermListTwo.add(peopleList.get(i));
						peopleList.remove(i);
					} else if (peopleList.get(i).getCthree()==k && mayTermListThree.size() < 14) {
						mayTermListThree.add(peopleList.get(i));
						peopleList.remove(i);
					}	else if ((peopleList.get(i).getFour()==k) && mayTermListFour.size() < 14) {
						mayTermListFour.add(peopleList.get(i));
					peopleList.remove(i);
					} else if (peopleList.get(i).getFive()==k && mayTermListFive.size() < 14) {
						mayTermListFive.add(peopleList.get(i));
					peopleList.remove(i);
					} else if (peopleList.get(i).getSix()==k && mayTermListSix.size() < 14){
						mayTermListSix.add(peopleList.get(i));
						peopleList.remove(i);
					} else if (peopleList.get(i).getSeven()==k && mayTermListSeven.size() < 14){
						mayTermListSeven.add(peopleList.get(i));
						peopleList.remove(i);
					} else if (peopleList.get(i).getEight()==k && mayTermListEight.size() < 14){
						mayTermListEight.add(peopleList.get(i));
					peopleList.remove(i);
					}	else if (peopleList.get(i).getNine()==k && mayTermListNine.size() < 14){
						mayTermListNine.add(peopleList.get(i));
					peopleList.remove(i);
					} else if (peopleList.get(i).getTen()==k && mayTermListTen.size() < 14){
						mayTermListTen.add(peopleList.get(i));
						peopleList.remove(i);
					} else if (peopleList.get(i).getEleven()==k && mayTermListEleven.size() < 14){
						mayTermListEleven.add(peopleList.get(i));
					peopleList.remove(i);
					} else if (peopleList.get(i).getTwelve()==k && mayTermListTwelve.size() < 14){
						mayTermListTwelve.add(peopleList.get(i));
					peopleList.remove(i);
					} else if (peopleList.get(i).getThirdteen()==k && mayTermListThirdTeen.size() < 14){
						mayTermListThirdTeen.add(peopleList.get(i));
					peopleList.remove(i);
					} else if (peopleList.get(i).getFourteen()==k && mayTermListFourTeen.size() < 14){
						mayTermListFourTeen.add(peopleList.get(i));
					peopleList.remove(i);
					} else if (peopleList.get(i).getFiveteen()==k && mayTermListFiveTeen.size() < 14){
						mayTermListFiveTeen.add(peopleList.get(i));
					peopleList.remove(i);
					} else if (peopleList.get(i).getSixteen()==k && mayTermListSixTeen.size() < 14){
						mayTermListSixTeen.add(peopleList.get(i));
					peopleList.remove(i);
					} else if (k==18){
						//System.out.print(peopleList.get(i).getLastName());
						
						
				}

				}				
			}
	}
}