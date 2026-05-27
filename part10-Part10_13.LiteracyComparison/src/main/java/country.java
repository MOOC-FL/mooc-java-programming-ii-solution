class Country {
  private String name;
  private int year;
  private String gender;
  private double rate;

  public Country(String name, int year, String gender, double rate) {
    this.name = name;
    this.gender = gender;
    this.year = year;
    this.rate = rate;
  }

  public double getRate() {
    return this.rate;
  }

  @Override
  public String toString() {
    return name + " (" + year + "), " + gender + ", " + rate;
  }
}
