#include<stdio.h>
#include<conio.h>
#include<string.h>

void main()
{
char na[50],w[10],rp[10],t[10];
int i=0,j=0,k=0,c,l,p;
clrscr();

printf("\n ENTER STRING ");
gets(na);

printf("\n ENTER WORD TO FIND :");
gets(w);

printf("\n ENTER WORD TO REPLACE :");
gets(rp);

l=strlen(w);
c=strlen(rp);

for(i=0;na[i]!=NULL;i++)
{
   for(k=0,j=i;k<l;k++,j++)
   {
     if(na[j]==NULL)
     {
     i=j-i;
     break;
     }
   t[k]=na[j];
   }
   t[k]=NULL;

   p=strcmp(t,w);
    for(k=0,j=i;k<c;k++,j++)
  { if(p==0)
   {

      strcpy(t,rp);
      strcpy(na,t);
      }
   }
}
printf("\n %s",na);
getch();
}
