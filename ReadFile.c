#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>

int main()
{
  char Fname[20];
  int fd = 0;
  char Data[20];

  printf("Please enter file name that you want open\n");
  scanf("%s",Fname);

  fd = open(Fname,O_RDWR);
  if(fd == -1)
  {
    printf("Unable to open the file\n");
  }
  else
  {
    printf("File is Succesfully opened with FD %d\n",fd);
  }

  read(fd,Data,10);
  printf("Data from file is : %s\n",Data);

  close(fd);
  
  return 0;
}