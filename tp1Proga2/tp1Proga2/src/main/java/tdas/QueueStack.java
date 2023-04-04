package tdas;

public class QueueStack{
    private final StaticStack[] array;
    private int count;

    public QueueStack(int n) {
        this.array = new StaticStack[n];
        this.count = 0;
    }

    public void add(StaticStack staticQueue) {
        this.array[this.count] = staticQueue;
        this.count++;
    }

    public void remove() {
        if(this.count == 0) {
            System.out.println("Error, no se puede desacolar una cola vacia");
            return;
        }
        for(int i = 0; i < this.array.length - 1; i++) {
            this.array[i] = this.array[i+1];
        }
        this.count--;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public StaticStack getFirst() {
        if(this.count == 0) {
            System.out.println("Error, no se puede obtener el primero de una cola vacia");
            return null;
        }
        return this.array[0];
    }

    public int traza(){
            int suma = 0;
            for(int i=0; i < this.count; i++){

                for (int j=0; j < i; j++){
                    this.array[i].remove();
                }
                suma += this.array[i].getTop();
            }
            return suma;
    }
}
