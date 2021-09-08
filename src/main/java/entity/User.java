package entity;


    public class User {
        int id;
        String name;
        int phoneNumber;
        String specialist;
        String date;

        public User(int id, String name, int phoneNumber) {

        }

        public User() {
        }

        public User(int id, String name, int phoneNumber, String specialist, String date) {
            this.id = id;
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.specialist = specialist;
            this.date = date;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }


        @Override
        public String toString() {
            return id +
                    " \t" + name +
                    " \t" + phoneNumber;
        }
    }