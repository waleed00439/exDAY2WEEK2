import java.util.Date;
public class Visit {
    public class Visit {
        private Customer3 c;
        private Date date;
        private double serviceExpense;
        private double productExpense;

        public Visit(String name, Date date) {
            this.c = new Customer3(name);
            this.date = new Date();
        }

        public double getToltalExpense() {
            return serviceExpense + productExpense;
        }

        public Customer3 getC() {
            return c;
        }

        public void setC(Customer3 c) {
            this.c = c;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public double getServiceExpense() {
            return serviceExpense;
        }

        public void setServiceExpense(double serviceExpense) {
            this.serviceExpense = serviceExpense;
        }

        public double getProductExpense() {
            return productExpense;
        }

        public void setProductExpense(double productExpense) {
            this.productExpense = productExpense;
        }

        @Override
        public String toString() {
            return "Visit{" +
                    "c=" + c +
                    ", date=" + date +
                    ", serviceExpense=" + serviceExpense +
                    ", productExpense=" + productExpense +
                    '}';
        }
    }}