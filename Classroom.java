class Classroom  {
    public static void main(String[] args) {

        Wilder instance1 = new Wilder("Bob", true);
        Wilder instance2 = new Wilder("Claude", false);

        Wilder instance3 = new Wilder("Bernard", true);
        Wilder instance4 = new Wilder("Mohamed", true);

        Wilder instance5 = new Wilder("Aziz", false);
        Wilder instance6 = new Wilder("Claudio", false);
        Wilder instance7 = new Wilder("Kojima", false);


        System.out.println("Instance 1 : " + instance1.whoAmI());
        System.out.println("Instance 2 : " + instance2.whoAmI());

        System.out.println("Instance 3 : " + instance3.whoAmI());
        System.out.println("Instance 4 : " + instance4.whoAmI());

        System.out.println("Instance 5 : " + instance5.whoAmI());
        System.out.println("Instance 6 : " + instance6.whoAmI());
        System.out.println("Instance 7 : " + instance7.whoAmI());


    }
}