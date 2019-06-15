import java.util.Scanner;

public class ThemPhanTuVaoTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do
            {
                System.out.println("Nhap so phan tu vao mang");
                size=scanner.nextInt();
                if(size>100)
                {
                    System.out.println("Qua phan tu nhap duoc");
                }
            }
        while (size>100);
        array=new int[size+1];
        for(int i=0;i<array.length-1;i++)
        {
            System.out.println("Phan tu thu "+(i+1)+" ");
            array[i]=scanner.nextInt();
        }
        HienThi(array,array.length-1);
        System.out.println("Nhap phan tu muon them ");
        int value=scanner.nextInt();
        System.out.println("Vi tri muon them ");
        int index=scanner.nextInt();
        if(index>=0&&index<array.length)
        {
            for(int j=array.length-1;j>index;j--)
            {
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
            }
            array[index]=value;
            HienThi(array,array.length);
        }
        else
            {
                System.out.println("Khong them duoc phan tu");
            }


    }
   static void HienThi(int[] array,int num)
    {

        int i=0;
       for(;i<num;i++)
     {
            System.out.println("Phan tu thu "+(i+1)+" "+array[i]);

        }
    }
}
