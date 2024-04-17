
class Assignment5
{
    public static void main(String[] args)
    {
        producer obj1 = new producer();
        consumer obj2 = new consumer(obj1);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
class producer extends Thread
{
    StringBuffer sb;
    //boolean dataproducer = false;
    producer()
    {
        sb = new StringBuffer();
    }
    public void run()
    {
        synchronized(sb)
        {
        for(int i=1; i<=10; i++)
        {
            try{
                sb.append(i+" ");
                Thread.sleep(500);
                System.out.println("Appending");
            }
            catch(Exception e){ }
            //dataproducer = true;
        }
            sb.notify();
        }
    }
}
class consumer extends Thread{
    producer prod;
    consumer(producer prod){
        this.prod = prod;
    }
    public void run(){
        try{
            prod.sb.wait();
            //while(!prod.dataproducer){
                Thread.sleep(10);
            //}
        }
        catch(Exception e){ }
        System.out.println(prod.sb);
    }
}
