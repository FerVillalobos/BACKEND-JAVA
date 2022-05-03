public abstract class SpiderV {

    private String name;

    public SpiderV(String name){

        this.name = name;

    }

    public String getName(){ return name;  }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }


    public String showMessage(){
        return
                        " name: "+name;

    }

    public abstract void Salto(Screen s);
}


