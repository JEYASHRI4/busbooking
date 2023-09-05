import React from 'react';
import { Link } from 'react-router-dom';
import './HomePage.css';
export default function HomePage() {
  return (
    <div className="homepage">
      <h1>Welcome to the Home Page</h1>
      <nav>
        <ul>
          <li>
            <Link to="/search">Search</Link>
          </li>
          <li>
            <Link to="/">Login</Link>
          </li>
          <li>
            <Link to="/form">Form</Link>
          </li>
          <li>
          <Link to="/getdetails">Get</Link>
          </li>
          <li>
          <Link to="/update">Update</Link>
          </li>
        </ul>
      </nav>
    </div>
  );
}
