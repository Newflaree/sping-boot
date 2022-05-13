// Call the dataTables jQuery plugin
$(document).ready(function() {
  chargeUsers();
  $('#users').DataTable();
});

const chargeUsers = async () => {
  const request = await fetch( 'users/1243', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });

  const users = await request.json();
  console.log( users );
}
