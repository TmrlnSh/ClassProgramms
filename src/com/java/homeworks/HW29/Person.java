package com.java.homeworks.HW29;

    class Person{
        private String name;
        private int age;
        private String from;
        private int height;
        private int weight;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getName() {
            return "Name "+name;
        }

        public String getAge() {
            return "Age "+age;
        }

        public String getFrom() {
            return "From "+from;
        }

        public String getHeight() {
            return "Height "+height+"cm";
        }

        public String getWeight() {
            return "Weight "+weight+"kg";
        }
    }
