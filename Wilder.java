class Wilder  {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }
    
    public boolean isAware() {
        return this.aware;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if (this.isAware()) {
            return "Je m'apelle " + this.getFirstname() + " et je suis aware.";
        } else {
            return "Je m'apelle " + this.getFirstname() + " et je ne suis PAS aware.";
        }
    }
    
}