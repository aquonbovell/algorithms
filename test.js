// // console.log(gcd(154552, 6458520));

// function gcd(m, n) {
//   if (m < 0 || n < 0) {
//     return 0;
//   }
//   let r = 0;
//   while (n != 0) {
//     r = m % n;
//     m = n;
//     n = r;
//   }

//   return m;
// }

// // const gcd = (m, n) => {
// //   let t = Math.min(m, n);
// //   while (m % t != 0) {
// //     t--;
// //   }
// //   if (n % t == 0) {
// //     return t;
// //   }
// // };

// const factors = (n) => {
//   const A = [];
//   for (let index = 2; index <= n; index++) {
//     A[index] = index;
//   }
//   for (let index = 2; index <= Math.floor(Math.sqrt(n)); index++) {
//     if (A[index] !== 0) {
//       console.log("kill me");
//       let j = index * index;
//       while (j <= index) {
//         A[j] = 0;
//         j = j + index;
//       }
//     }
//   }
// };

// factors(18);

// let arr = ["A", "b", 1, 2, 35];
// arr.forEach((item) => {
//   arr.findIndex(item);
// });

const questions = [
  "Why are you interested in becoming the secretary of the Computer Science Society, and what do you know about our club's mission and activities?",

  "Can you describe any relevant experience you have in student organizations or clubs on campus?",

  "How do you envision contributing to the success and growth of the Computer Science Society in your role as secretary?",

  "Are you familiar with university club regulations and procedures, such as budget management and event planning approval processes?",

  "How would you handle communication with club members, including announcements, updates, and responding to inquiries or feedback?",

  "In a university club setting, it's important to maintain engagement and participation. How would you encourage active involvement among club members?",

  "Can you share an example of a time when you had to effectively collaborate with a diverse group of individuals in a student club or similar setting?",

  "What strategies would you use to keep accurate records of club meetings, activities, and membership lists?",

  "Are you available and committed to attending club meetings, events, and activities, which may sometimes be held during evenings on weekdays?",

  "How would you handle the distribution of club materials, such as flyers, newsletters, or promotional materials, to reach a wider audience on campus?",

  "What role do you believe the Computer Science Society plays in enhancing the overall university experience for students?",

  "Can you describe any ideas or initiatives you would like to implement as the club's secretary to improve our operations or engage more students?",
];
const qs = [
  "Can you describe your background and experience in public relations, marketing, or graphic design, and how it relates to the PRO role in our committee?",

  "What motivated you to apply for the PRO position in our committee, and what aspects of our organization's mission and goals resonate with you?",

  "Graphic Design: Can you provide examples of graphic design work you've created for promoting events or organizations in the past?",

  "Social Media Management: How do you stay updated with current social media trends, and can you share a successful social media campaign you've managed?",

  "Public Communication: How do you approach representing an organization to external parties, and what strategies do you use to maintain professionalism and a positive image?",

  "Event Promotion: Can you walk us through the steps you would take to create and execute a successful marketing plan for one of our upcoming events?",

  "Brand Awareness: How would you go about increasing our committee's visibility and recognition within the university and the local tech community?",

  "Collaboration: Give an example of a time when you worked closely with a team to ensure consistent messaging and branding. How did you handle any challenges that arose during that collaboration?",

  "Feedback Collection: Explain your approach to gathering feedback from members and event attendees. How do you use this feedback to improve outreach efforts and event experiences?",

  "Time Management: Public relations work often involves managing multiple tasks and deadlines. How do you prioritize and stay organized in a fast-paced environment?",

  "Crisis Management: What steps would you take to handle a negative public relations situation or crisis related to our committee?",

  "Long-Term Strategy: Can you outline your vision for the PRO role in our committee over the next year? What specific goals or initiatives would you like to pursue?",

  "Technology Proficiency: Are there specific software or tools you are proficient in that would be relevant to the PRO role (e.g., graphic design software, social media management platforms)?",

  "Creativity: Share an example of a creative marketing or promotional idea you've implemented in the past and its impact.",

  "Availability and Commitment: The PRO role may require a significant time commitment. Are you available and willing to dedicate the necessary time to fulfill your responsibilities effectively?",
];

// for (let index = 0; index < 5; index++) {
//   console.log(questions[Math.floor(Math.random() * questions.length)]);
//   console.log("");
// }

for (let index = 0; index < 5; index++) {
  console.log(qs[Math.floor(Math.random() * qs.length)]);
  console.log("");
}
