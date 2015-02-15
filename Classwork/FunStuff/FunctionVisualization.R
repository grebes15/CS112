# FunctionVisualization.R

# define the range of values for which you want to plot this
# function (refers to the value on the horizontal axis)
n = seq(1:100)

# define some functions that we want to visualize
# students should consider adding in new functions
# in order to compare their worst-case growth

# Consider trying: n^2, n^3, 2^n, n^n, n! and other functions

# Question: which function grows the fastest?

# Remember, you can also display full tables of data by simply
# typing the name of one of the below variables!

LogarithmicFunction = log2(n)
LinearFunction = n
QuadraticFunction = n^2
CubicFunction = n^3
ExponentialBase2 = 2^n
ExponentialBase = n^n
PlotLogarithmicFunction = function()
  {
    
    PlotAnyFunction(LogarithmicFunction)

  }

PlotLinearFunction = function()
  {
    
    PlotAnyFunction(LinearFunction)

  }

PlotQuadraticFunction = function()
  {
    
    PlotAnyFunction(QuadraticFunction)

  }

PlotCubicFunction = function()
  {

    PlotAnyFunction(CubicFunction)

  }	
PlotAnyFunction = function(FunctionToPlot)
  {

    plot(n, FunctionToPlot,
         xlab = "n",
         ylab = "f(n)",
         type="l")
    
  }

ReloadFunctionVisualization = function()
{

  source("FunctionVisualization.R")
  
}
