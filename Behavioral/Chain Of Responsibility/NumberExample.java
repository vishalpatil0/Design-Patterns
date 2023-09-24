class Number {
    private int number;

    Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

abstract class Processor {
    private Processor nextProcessor;

    Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void process(Number request) {
        if (nextProcessor != null) {
            nextProcessor.process(request);
        }
    }
}

class PositiveProcessor extends Processor {

    PositiveProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("Positive processor --> "+request.getNumber());
            return;
        }
        super.process(request);
    }

}

class NegativeProcessor extends Processor {

    NegativeProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("negative processor --> "+request.getNumber());
            return;
        }
        super.process(request);
    }

}


class ZeroProcessor extends Processor {

    ZeroProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("Zero processor --> "+request.getNumber());
            return;
        }
        super.process(request);
    }

}


class Chain
{
Processor chain;
  
public Chain(){
    buildChain();
}
  
private void buildChain(){
    chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
}
  
public void process(Number request) {
    chain.process(request);
}
  
}


public class NumberExample {
    public static void main(String[] args) {
        Chain chain = new Chain();
          
        //Calling chain of responsibility 
        chain.process(new Number(90)); 
        chain.process(new Number(-50)); 
        chain.process(new Number(0)); 
        chain.process(new Number(91)); 
    }    
}
