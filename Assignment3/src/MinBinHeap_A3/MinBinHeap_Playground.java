package MinBinHeap_A3;

public class MinBinHeap_Playground {
	public static void main(String[] args){   
	    //Add more tests as methods and call them here!!
	    //TestBuild();
	    TestBuild1();
	    //test2();
	  }
	  
	  public static void TestBuild(){ 
	    // constructs a new minbinheap, constructs an array of EntryPair, 
	    // passes it into build function. Then print collection and heap.
	    MinBinHeap mbh= new MinBinHeap();
	    EntryPair[] collection= new EntryPair[13];
	    collection[0]=new EntryPair("12",12);
	    collection[1]=new EntryPair("3",3);
	    collection[2]=new EntryPair("17",17);
	    collection[3]=new EntryPair("45",45);
	    collection[4]=new EntryPair("0",0);
	    collection[5]=new EntryPair("1",1);
	    collection[6]=new EntryPair("14",14);
	    collection[7]=new EntryPair("9",9);
	    collection[8]=new EntryPair("55",55);
	    collection[9]=new EntryPair("73",73);
	    collection[10]=new EntryPair("5",5);
	    collection[11]=new EntryPair("21",21);
	    collection[12]=new EntryPair("34",34);
	    
	    
	    mbh.build(collection);
	    printHeapCollection(collection);
	    printHeap(mbh.getHeap(), mbh.size());
	    //System.out.println(mbh.size());
	  }
	  public static void TestBuild1(){ 
		    // constructs a new minbinheap, constructs an array of EntryPair, 
		    // passes it into build function. Then print collection and heap.
		    MinBinHeap mbh= new MinBinHeap();
		    EntryPair[] collection= new EntryPair[13];
		    collection[0]=new EntryPair("12",6);
		    collection[1]=new EntryPair("3",3);
		    collection[2]=new EntryPair("17",29);
		    collection[3]=new EntryPair("45",21);
		    collection[4]=new EntryPair("0",7);
		    collection[5]=new EntryPair("1",2);
		    collection[6]=new EntryPair("14",19);
		    collection[7]=new EntryPair("9",24);
		    collection[8]=new EntryPair("55",8);
		    collection[9]=new EntryPair("73",4);
		    collection[10]=new EntryPair("73",61);
		    collection[11]=new EntryPair("73",16);
		    collection[12]=new EntryPair("73",9);
		    
		    
		    
		    mbh.build(collection);
		    printHeapCollection(collection);
		    printHeap(mbh.getHeap(), mbh.size());
		    //System.out.println(mbh.size());
		    mbh.delMin();
		    //mbh.build(collection);
		    //printHeapCollection(collection);
		    printHeap(mbh.getHeap(), mbh.size());
	  }
	  public static void test2(){
		  MinBinHeap mbh=new MinBinHeap();
		  EntryPair[] collection=new EntryPair[3];
		  collection[0]= new EntryPair("i",2);
		  collection[1]=new EntryPair("b",3);
		  collection[2]= new EntryPair("c",1);
		  mbh.insert(collection[0]);
		  mbh.insert(collection[1]);
		  mbh.insert(collection[2]);
		  mbh.build(collection);
		  printHeapCollection(collection);
		  printHeap(mbh.getHeap(),mbh.size());
		  //mbh.delMin();
		  printHeap(mbh.getHeap(),mbh.size());
		  //mbh.delMin();
		  printHeap(mbh.getHeap(),mbh.size());
		  
		  
	  }
	  
	  public static void printHeapCollection(EntryPair[] e) { 
	    //this will print the entirety of an array of entry pairs you will pass 
	    //to your build function.
	    System.out.println("Printing Collection to pass in to build function:");
	    for(int i=0;i < e.length;i++){
	      System.out.print("("+e[i].value+","+e[i].priority+")\t");
	    }
	    System.out.print("\n");
	  }
	  
	  public static void printHeap(EntryPair[] e,int len) { 
	    //pass in mbh.getHeap(),mbh.size()... this method skips over unused 0th index....
	    System.out.println("Printing Heap");
	    for(int i=1;i < len+1;i++){
	      System.out.print("("+e[i].value+","+e[i].priority+")\t");
	    }
	    System.out.print("\n");
	  }

}
