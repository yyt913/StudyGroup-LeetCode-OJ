# -*- coding: utf-8 -*-
# import time
import threading
import sys
import time


	
class main(object):
	"""docstring for main"""
	def __init__(self):
		a = 0
		lis = []
		lis.append(a)
		print lis[0]
		#print a == 0 ? 1 : 2
		
	def print_num(self):
		print time.ctime()
		time.sleep(1)
		print time.ctime()
		return
if __name__ == '__main__':
	main()
