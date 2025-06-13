//App.js

import './App.css';
import Sviet from './sviet.js'
function App() {
  return (
    <div className="App">
      { <header className="App-header">
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
        <Sviet title="Empowering Minds"></Sviet>
      </header> }
      
    </div>
  );
}

export default App;


//Sviet.js

export default function Sviet(props)
{
    return(
        <div>
            <h1>
                {props.title}
            </h1>
        </div>

    );
}
