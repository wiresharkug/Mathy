package mathy.gideon.mensah;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mathy {
	double x;
	double total;
	private double g;
	
//factorial 
	public int facto(int n) {
		int fact;
		if(n==0||n==1) {
			return 1;
		}else {
			fact =facto(n-1)*n;
			return fact;
		}
	}
	
	//Bernoulli Expectation
	public double berEx(double p) {
		if(p<1 || p>0) {
		double expect = p;
		return expect;
		}else {
			return 0;
		}
	}
	public double berVar(double p) {
		if(p<1 || p>0) {
		double x = p;
		double y = 1-p;
		double  var = x*y;
		return var;
		}else {
			return  0;
		}
	}
	public double berSkew(double p) {
		if(p<1 || p>0) {
			double x = p;
			double y = 1-p;
			double  skew = x-y/Math.pow(x*y, 0.5);
			return skew;
			}else {
				return  0;
			}
		
	}
	public double binomEx(int n, double p) {
		if(p<1 || p>0) {
			double expect  = n*p;
			return expect;
			}else {
				return  0;
			}
	}
	
	public double binomVar(int n, double p) {
		if(p<1 || p>0) {
			double x  = n*p;
			double y = 1-p;
			double var = x*y;
			return var;
			}else {
				return  0;
			}
	}
	public double binom(double p,int n, int k) {
		if(p<1 || p>0) {
			double binom = (facto(n)/(facto(n-k)*facto(k)))*Math.pow(p, n)*Math.pow(1-p, n-k);
			return binom;
			}else {
				return  0;
			}
	}
	//combination
	public int ncr(int n, int r) {
		int ncr = (facto(n)/(facto(n-r)*facto(r)));
		return ncr;
	}
	
	//permutations
	
	public int npr(int n, int r) {
		int npr = (facto(n)/(facto(r)));
		return npr;
	}
	
	
	
//Square libraries
public double sqrt(double x) {
	double y = Math.pow(x, 0.5);
	return y;
}
public double sqrt(int x) {
	double y = Math.pow(x, 0.5);
	return y;
}

public double sqr(double x) {
	double y = Math.pow(x,2);
	return y;
}
public double sqr(int x) {
	double y = Math.pow(x,2);
	return y;
}
 public double nsqr(double x, int n) {
	 double y = Math.pow(x, n);
	 return y;
 }
 
 public double nsqr(int x, int n) {
	 double y = Math.pow(x, n);
	 return y;
 }
 //Sum libraries
 
 //mean
 public  double mean(double[] m) {
	    double sum = 0;
	    for (int i = 0; i < m.length; i++) {
	        sum += m[i];
	    }
	    return sum / m.length;
	}
 public double mean(int[] m) {
	    double sum = 0;
	    for (int i = 0; i < m.length; i++) {
	        sum += m[i];
	    }
	    return sum / m.length;
	}
 public static double median(double[] m) {
	    int middle = m.length/2;
	    if (m.length%2 == 1) {
	        return m[middle];
	    } else {
	        return (m[middle-1] + m[middle]) / 2.0;
	    }
	}
 public static double median(int[] m) {
	    int middle = m.length/2;
	    if (m.length%2 == 1) {
	        return m[middle];
	    } else {
	        return (m[middle-1] + m[middle]) / 2.0;
	    }
	}
 
 public static List<Integer> mode(final int[] numbers) {
	    final List<Integer> modes = new ArrayList<Integer>();
	    final Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

	    int max = -1;

	    for (final int n : numbers) {
	        int count = 0;

	        if (countMap.containsKey(n)) {
	            count = countMap.get(n) + 1;
	        } else {
	            count = 1;
	        }

	        countMap.put(n, count);

	        if (count > max) {
	            max = count;
	        }
	    }

	    for (final Map.Entry<Integer, Integer> tuple : countMap.entrySet()) {
	        if (tuple.getValue() == max) {
	            modes.add(tuple.getKey());
	        }
	    }

	    return modes;
	}
 
//Standard deviation
 public double stdDev(double numArray[],int n)
 {
     double sum = 0.0, standardDeviation = 0.0;

     for(double num : numArray) {
         sum += num;
     }

     double mean = sum/n;

     for(double num: numArray) {
         standardDeviation += Math.pow(num - mean, 2);
     }

     return Math.sqrt(standardDeviation/n);
 }
 
 
 public double stdDev(int numArray[],int n)
 {
     double sum = 0.0, standardDeviation = 0.0;

     for(double num : numArray) {
         sum += num;
     }

     double mean = sum/n;

     for(double num: numArray) {
         standardDeviation += Math.pow(num - mean, 2);
     }

     return Math.sqrt(standardDeviation/n);
 }
 
 //
}
