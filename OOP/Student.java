public class Student {
        
        String name;
         int Rno;
        double persent;

        // final keyword
        final String scl = "GEHU";

        // Static keyword
        static int noOfStudent;
        

        // public int getRno() {
        //         return Rno;
        // }

        // public void setRno(int Rno) {
        //         Roll = Rno;
        // }


                // this keyword use
        // public void setRno(int Rno) {
        //         this.Rno = Rno;
        // }

        // Constructer
        public Student(String name, int Rno, double persent) {
                this.name = name;
                this.Rno = Rno;
                this.persent = persent;
                noOfStudent++;
        }
}
