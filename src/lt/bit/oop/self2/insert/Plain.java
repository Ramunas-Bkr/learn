package lt.bit.oop.self2.insert;

class Plain {
    private String model;
    private int age, range;
    private float speed;

        class Wing {
            private float weight;
            public void setWeight (float weight) {
                this.weight = weight;
            }
            public void getWeight () {
                System.out.println("Lektuvo sparno svoris: " + this.weight);
            }
        }
        Wing wing = new Wing();
}
