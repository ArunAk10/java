from flask import Flask
import numpy
app=Flask(__name__)
@app.route('/')

def home():
	return "hello this is our first flask application."

if __name__=='__main__':
	app.run(debug=True)
