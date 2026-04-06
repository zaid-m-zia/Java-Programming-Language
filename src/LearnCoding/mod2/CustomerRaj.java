package LearnCoding.mod2;
//interface variables
public interface CustomerRaj {
    int amt = 5;  // public + static+ final
    void purchase(); // public + abstract
}

class SellerSanju implements CustomerRaj{
        @Override      // class implementing interface must override the interface methods
        public void purchase() {
            System.out.println(amt);
        }
        static void main(String[] args) {
            CustomerRaj ref = new SellerSanju();
            ref.purchase();

    }
}
