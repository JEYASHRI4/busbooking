//import logo from './logo.svg';
import './App.css';
import Form from './components/Form';
import Createaccount from './components/Signup';
import Update from './components/Update';
import {BrowserRouter,Routes,Route} from "react-router-dom";
import Search from './components/Search';
import HomePage from './components/HomePage';
import Login from './components/Login';
import Getdetails from './components/Getdetails';
import Delete from './components/Delete';
function App() {
  return (
    <div className="App">
    <BrowserRouter>
      <Routes>
        <Route exact path="/" element={<Login/>}/>
        <Route exact path="/homepage" element={<HomePage/>}/>
        <Route exact path="/search" element={<Search/>}/>
        <Route exact path="/getdetails" element={<Getdetails/>}/>
        <Route exact path='/createaccount' element={<Createaccount/>}/>
        <Route exact path="/form" element={<Form/>}/>
        <Route exact path="/update" element={<Update></Update>}/>
        <Route exact path="/delete" element={<Delete></Delete>}></Route>
      </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
