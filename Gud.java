package Labb1GUI;

public class Gud {

        private String namn;
        private String slakte;
        private String beskrivning;

        public Gud() {
        }

        public Gud(String namn, String slakte, String beskrivning) {
            this.namn = namn;
            this.slakte = slakte;
            this.beskrivning = beskrivning;
        }

        public String getNamn() {
            return namn;
        }

        public void setNamn(String namn) {
            this.namn = namn;
        }

        public String getSlakte() {
            return slakte;
        }

        public void setSlakte(String slakte) {
            this.slakte = slakte;
        }

        public String getBeskrivning() {
            return beskrivning;
        }

        public void setBeskrivning(String beskrivning) {
            this.beskrivning = beskrivning;
        }
    }

