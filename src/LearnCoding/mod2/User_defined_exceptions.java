package LearnCoding.mod2;

class User_defined_exceptions {
}

// now making class to define the user defined exception

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        System.out.println(msg);
    }
}

class test {

    public static void main(String[] args) {
        try {
            vote(12);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void vote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not allowed to vote");
        } else {
            System.out.println("Allowed to vote");
        }
    }
}
