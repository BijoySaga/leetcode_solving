class Solution
{
public:
  string largestGoodInteger (string num)
  {
    int sizeN = num.size ();
    string value = "";
    string samdigit = "";
    char current = num[0];
    for (int i = 0; i < sizeN - 2; i++)
      {
	if ((num[i] == num[i + 1]) && (num[i + 1] == num[i + 2]))
	  {
	    value = num.substr (i, 3);
	    samdigit = max (value, samdigit);
	  }
      }
    return samdigit;
  }
};