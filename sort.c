#include <stdio.h>

int bubble_sort(int a[], int len);
int quicksort(int begin, int end, int a[], int len);

void main()
{
	int a[] = {33, 22, 6, 5, 7, 3, 8, 9};
	int len = sizeof(a)/sizeof(int);
	int i=0;
	int j=len-1;

	// bubble sort
	bubble_sort(a, len);
	//int pivot;
	//pivot = quicksort(i, j, a, len);
//printf("\npivot:%d\n", pivot);
	for(i=0; i<len; i++) 
	{
		printf("%d ", a[i]);
	}
}
int bubble_sort(int a[], int len)
{
	int i,j;
	int tmp;
	for(i=0; i<len-2; i++)
	{
		for(j=0; j<len-1-i; j++)
		{
			if(a[j] > a[j+1])
			{
				tmp = a[j];
				a[j] = a[j+1];
				a[j+1] = tmp;		
			}
		}
	}
	return 1;
}

int quicksort(int begin, int end, int a[], int len)
{
	int tmp = 0;
	for(tmp=begin; tmp<=end; tmp++) 
	{
		printf("%d ", a[tmp]);
	}
	printf("\n");
	
	int i=begin;
	int j = end;
	int key = a[i];
	//simple quick sort
	while(i<j)
	{
		while(a[j]>key && j>=0 && i<j)
		{
			j--;
		}
		if(j>=0 && i<j)
		{
			a[i] = a[j];
		}
		
		while(a[i]<key && i<len && i<j)
		{
			i++;
		}
		if(i<len && i<j)
		{
			a[j] = a[i];
		}
		
	}
	a[i] = key;

	int pivot = i;
	
	if(pivot > begin)
		quicksort(begin, pivot-1, a, pivot-begin);
	
	if(pivot < end)
		quicksort(pivot+1, end, a, end-pivot);
	
	return i;
}
