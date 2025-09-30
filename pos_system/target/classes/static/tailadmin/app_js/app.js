// Load header from partials/aside.html
    fetch('/tailadmin/partials/aside.html')
      .then(response => response.text())
      .then(data => {
        document.getElementById('aside-container').innerHTML = data;
      });

    // Load footer from partials/footer.html
    fetch('/tailadmin/partials/header.html')
      .then(response => response.text())
      .then(data => {
        document.getElementById('header-container').innerHTML = data;
      });