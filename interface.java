interface member{
    void callback();
}
class store {
        member[]mem=new member[100];
        int count=0;
        void register(member  m)
        {
            mem[count++]=m;
        }

void invitesale(){
    for(int i=0;i<count;i++){
        mem[i].callback();
    }
}

    }
class customer implements member{
    String name;
    customer(String n){
        name=n;
    }
    
         public void callback(){
            System.out.println("i will visit ok "+name);
        }
    }
    
class interfacedemo{
    public static void main(String[]args){
        store s=new store();
        customer c1=new customer("gokul");
        customer c2=new customer("niranjan");
        s.register(c1);
        s.register(c2);
        s.invitesale(); 
    }
}
