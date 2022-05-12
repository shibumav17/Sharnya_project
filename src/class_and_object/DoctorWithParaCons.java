package class_and_object;

public class DoctorWithParaCons {
//Data Member
    String name;
    String Specialization;
    String Location;
    int fee;
    double timing;
   //Parameterized Constructor
    public DoctorWithParaCons(String name, String Specialization, String Location, int fee, double timing) {

        this.name = name;
        this.Specialization = Specialization;
        this.Location = Location;
        this.fee = fee;
        this.timing = timing;
    }

        public static void main(String[] args){

            //SYNTAX Classname obj_name= new ClassName(para1, para2, para3...);

            DoctorWithParaCons obj = new DoctorWithParaCons("Dr Arun Agarwal", "Obtetrician", "Arjun Nagar", 200, 11.00);

            System.out.println("Name of the Doctor: " + obj.name);
            System.out.println("Specialization of the doctor: " + obj.Specialization);
            System.out.println("Location of the Clinic: " + obj.Location);
            System.out.println("Consultation fee: " + obj.fee);
            System.out.println("Timing of the Doctor: " + obj.timing);

        }

    }

