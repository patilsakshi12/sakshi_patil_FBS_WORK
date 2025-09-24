class Date {
     int day, month, year;
     String dow;

     void setDay(int d) {
        this.day = d;
    }

     void setMonth(int m) {
        this.month = m;
    }

    void setYear(int y) {
        this.year = y;
    }

     void setDow(String str) {
        this.dow = str;
    }

    int getDay() {
        return this.day;
    }

     int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

   String getDow() {
        return this.dow;
    }
    void display()
    {
      System.out.println(this.day+"/"+this.month+"/"+this.year);
    }
}

class Test {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();
       // set value using setter
        d1.setDay(10);
        d1.setMonth(9);
        d1.setYear(2025);
        d1.setDow("Wed");

        d2.setDay(4);
        d2.setMonth(6);
        d2.setYear(2025);
        d2.setDow("Sun");

        // Get values using getters
        System.out.println("Date d1:");
        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());
        System.out.println(d1.getDow());

        System.out.println("Date d2:");
        System.out.println(d2.getDay());
       
        // Compare dates
        if (d1.getDay() > d2.getDay()) {
            System.out.println("d1 is younger than d2");
        } else {
            System.out.println("d1 not younger");
        }

        if (d1.getMonth() > d2.getMonth()) {
            System.out.println("d1 has greater month");
        } else {
            System.out.println("d2 has greater month");
        }

        d2.display();
    }
}
