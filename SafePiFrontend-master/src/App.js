import './App.css';
import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import ListSensorComponent from './components/ListSensorComponent';

function App() {
  return (
    <div>
      <Router>
        {/* Header */}
        <div className= "container" >
          <Routes>
            <Route exact path = "/" component = {ListSensorComponent}></Route>
            <Route path = "/sensors" component = {ListSensorComponent}></Route>
          </Routes>
          <ListSensorComponent/>
        </div>
        
        {/* Footer */}
      </Router>
      
    </div>
  );
}

export default App;
