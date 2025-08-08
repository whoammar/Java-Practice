public class Burger{
    String title;
    String bread;
    String pattyType;
    int patties;
    boolean isCheese;
    boolean isSalad;
    int price;
    int size;

    public Burger(Builder builder) {
        this.title = builder.title;
        this.bread = builder.bread;
        this.pattyType = builder.pattyType;
        this.patties = builder.patties;
        this.isCheese = builder.isCheese;
        this.isSalad = builder.isSalad;
        this.price = builder.price;
        this.size = builder.size;
    }

    public static  class Builder{
        String title;
        String bread;
        String pattyType;
        int patties;
        boolean isCheese;
        boolean isSalad;
        int price;
        int size;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBread() {
            return bread;
        }

        public void setBread(String bread) {
            this.bread = bread;
        }

        public String getPattyType() {
            return pattyType;
        }

        public void setPattyType(String pattyType) {
            this.pattyType = pattyType;
        }

        public int getPatties() {
            return patties;
        }

        public void setPatties(int patties) {
            this.patties = patties;
        }

        public boolean isCheese() {
            return isCheese;
        }

        public void setCheese(boolean cheese) {
            isCheese = cheese;
        }

        public boolean isSalad() {
            return isSalad;
        }

        public void setSalad(boolean salad) {
            isSalad = salad;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
      public Burger build() {
          return new Burger(this);
        }
    }

}