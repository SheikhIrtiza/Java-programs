 class nonstatic {
    
    {  //non static block has only parenthesis and ther is no method over it just curly braces. this block is called at the instantiation of the class
        System.out.println("non static block"); 
    }
     nonstatic()
     {
        System.out.println("constructor block"); 
     }
     public static void main(String args[])
     {
        nonstatic obj1 = new nonstatic(); //making object
     }
}
