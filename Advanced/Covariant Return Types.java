// Following the diagram given

class Flower{ // superclass
    String whatsYourName()
    {
        return "I have many names and types";
    }
}

class Jasmine extends Flower{
    @Override // Tell the compiler you're going to override the method from the parent class in the child-class
    String whatsYourName()
    {
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    String whatsYourName()
    {
        return "Lily";
    }
}


class Lotus extends Flower{
    @Override
    String whatsYourName()
    {
        return "Lotus";
    }
}

class State { // superclass
    Flower yourNationalFlower()
    {
        return new Flower();
    }
}

class WestBengal extends State{
    @Override
    Flower yourNationalFlower()
    {
        return new Jasmine();
    }
}

class Karnataka extends State{
    @Override
    Flower yourNationalFlower()
    {
        return new Lotus();
    }
}

class AndhraPradesh extends State{
    @Override
    Flower yourNationalFlower()
    {
        return new Lily();
    }
}