package com.company.ex22;

public class DistanceConverter {

        private  double dist;

        public DistanceConverter() {
        }

        public DistanceConverter(double dist) {
            this.dist = dist;
        }

        public double convertMilesToMeters() {
            return dist * 1609;
        }

        public double convertMetersToMiles() {
            return dist / 1609;
        }

        public  double convertInchToCentimeter() {
            return dist * 2.54;
        }
        public  double convertCentimeterToInch(){
            return dist/2.54;
        }

        public double getDist() {
            return dist;
        }

        public void setDist(double dist) {
            this.dist = dist;
        }
    }
