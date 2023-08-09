#include<bits/stdc++.h>
using namespace std;
void CG(int &x, int &y, char &huong)
{
	if(huong=='b') y++;
	else if(huong=='n') y--;
	else if(huong=='t') x--;
	else x++;
}
void CB (int &x, int &y, char &huong)
{
	if(huong=='b'){y--;huong='n';}
	else if(huong=='n'){y++;huong='b';}
	else if(huong=='t'){x++;huong='d';}
	else {x--;huong='t';}
}
void CR (int &x, int &y, char &huong)
{
	if(huong=='b'){x++;huong='d';}
	else if(huong=='n'){x--;huong='t';}
	else if(huong=='t'){y++;huong='b';}
	else {y--;huong='n';}
}
void CL (int &x, int &y, char &huong)
{
	if(huong=='b'){x--;huong='t';}
	else if(huong=='n'){x++;huong='d';}
	else if(huong=='t'){y--;huong='n';}
	else {y++;huong='b';}
}
int main()
{
	int n;cin>>n;
	string s;
	cin>>s;
	char huong='b';
	int x=0;
	int y=0;
	for(int i=0;i<n;i++)
	{
		if(s[i]=='G') CG(x, y, huong);
		else if(s[i]=='B') CB(x, y, huong);
		else if(s[i]=='R') CR(x, y, huong);
		else CL(x, y, huong);
	}
	cout<<x<<" "<<y<<endl;
}