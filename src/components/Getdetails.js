import React, { useState } from 'react'
import axios from 'axios';
import './Getdetails.css';

export default function Getdetails() {
  const[info,setInfo]=useState([])
  const [emailid,setemailid]=useState('')
    const handleget = (e) => {
        e.preventDefault();
       // console.log(data)
        axios.get(`http://127.0.0.1:8085/showquerydetails/${emailid}`)
        .then(res => setInfo(res.data))
         
    }
    const handlegetdetails = (e) => {
      e.preventDefault();
     // console.log(data)
      axios.get(`http://127.0.0.1:8085/disp`)
      .then(res => setInfo(res.data))
       
  }
  return (
    <div>
    <form onSubmit={handleget}>
    <input type='email' onChange={(e)=>setemailid(e.target.value)}></input>
    <input type='submit' />
    <button onClick={handlegetdetails}>GET</button>
    </form>
    <table className='table-data'>
    <thead>
      <tr>
        <th>  ID  </th>
        <th>  Name </th>
        <th> Gender</th>
        <th> AGE </th>
        <th> DOB  </th>
        <th> PH_NO </th>
        <th> EMAIL </th>
      </tr>
    </thead>
    <tbody>
      {info.map((data) => (
        <tr key={data.id}>
          <td> {data.id}</td>
          <td> {data.name}</td>
          <td> {data.gender}</td>
          <td> {data.age}</td>
          <td> {data.dob}</td>
          <td> {data.ph_no}</td>
          <td> {data.emailid}</td>
        </tr>
      ))}
    </tbody>
  </table>
    </div>
  )
}
