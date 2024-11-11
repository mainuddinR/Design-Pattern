package BuilderL06;

public class Sandwich {
    private String bread;
    private String filling;
    private String accompaniment;

    private Sandwich(SandwichBuilder builder) {
        this.bread = builder.bread;
        this.filling = builder.filling;
        this.accompaniment = builder.accompaniment;
    }

    public String getBread() { return bread; }
    public String getFilling() { return filling; }
    public String getAccompaniment() { return accompaniment; }

    @Override
    public String toString() {
        return "Sandwich [Bread: " + bread + ", Filling: " + filling + ", Accompaniment: " + accompaniment + "]";
    }

    public static class SandwichBuilder {
        private String bread;
        private String filling;
        private String accompaniment;

        public SandwichBuilder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public SandwichBuilder setFilling(String filling) {
            this.filling = filling;
            return this;
        }

        public SandwichBuilder setAccompaniment(String accompaniment) {
            this.accompaniment = accompaniment;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }
}
