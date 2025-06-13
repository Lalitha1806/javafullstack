//app.js

import './App.css';
import Intro from'./intro.js';


function App() {
  return (
    <div className="App">
      
 <header className="App-header">
        <img src="https://www.sviet.edu.in/wp-content/uploads/2023/05/SVIET-LOGO-Edited.png"className="App-logo" alt="logo" />
        <p>
         SRI VASAVI INSTITUE OF ENGINEERING & TECHNOLOGY
        </p>
        <a
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          Sviet
        </a>
        <Intro/>
      </header> 
      
    </div>
  );
}

export default App;


// intro.js

function Intro()
{
    return(
        <div>
        <h1>Welcome to reactjs sesions</h1>
        </div>
    );
}
export default Intro;
