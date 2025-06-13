//App.js

import './App.css';
import Rform from './regist.js';

function App() {
  return (
    <div className="App">
      
      <Rform/>
    </div>
  );
}
export default App;


//registrationform

function Rform()
{
    return(
       <div>
      
         <h1 align="center"><u>Registration Form</u></h1>
     <form>
        <fieldset>
        <label>First Name:</label>
        <input type="text"placeholder="first name"/><br/><br/>
        <label>Middle Name:</label>
        <input type="text"placeholder="middle name"/><br/><br/>
        <label>Last Name:</label>
        <input type="text"placeholder="last name"/><br/><br/>
        <label>Email Id:</label>
        <input type="email"autofocus/><br/><br/>
        <label>Create Password:</label>
        <input type="password"placeholder="password"/><br/><br/>
        <label>Confirm Password:</label>
        <input type="password"/><br/><br/>
        <label>Mobile Number:</label>
        <input type="number"/><br/><br/>
        <lable>Date Of Birth:</lable>
        <input type="datetime-local"/><br/><br/>
        <label>Color:</label>
        <input type="color"/><br/><br/>
        <label for="">Gender:</label>
        <input type="radio"name="h"id="1"/>
        <label for="">Male</label>
        <input type="radio"name="h"id="2"/>
        <label for="">Female</label>
        <input type="radio"name="h"id="3"/>
        <label for="">Others</label><br/><br/>
        <label>Address:</label>
        <input type="address"placeholder="address"/>
        <label>City:</label>
        <input type="text"placeholder="city"/><br/><br/>
        <label>State:</label>
        <select>
            <option>AP</option>
            <option>TS</option>
            <option>TN</option>
            <option>K</option>
        </select><br/><br/>
        <label>Name of the college:</label>
        <input type="text"/><br/><br/>
        <label>Roll Number:</label>
        <input type="number"/>
        <label>Branch</label> 
        <select>
            <option>CSE</option>
            <option>ECE</option>
            <option>AIML</option>
            <option>MECH</option>
            <option>CIVIL</option>
        </select><br/><br/>
        <input type="checkbox"/>
         <label>I agree to the terms & conditions.</label><br/>
         <input type="checkbox"/>
         <label>By accesing or using our services,you agree to bound by these Terms.</label>
         <button type>Submit</button>
        </fieldset>
      </form>
    </div>
    );
}
export default Rform; 
