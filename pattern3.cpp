#include<iostream>
using namespace std;

int main()
{
    int n=5;
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if (j<=i)
            {
                cout<<j;
            }
            else
            {
                cout<<"  ";
            }
            {
                /* code */
            }
            
        }
        
        cout<<endl;
    }
    return 0;
}
/* Output:

1        
12      
123    
1234  
12345
    
*/